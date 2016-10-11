# Copyright (C) 2013-2016 PolyVection

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
DESCRIPTION = "Wireless firmware for WiLink8 module on PolyVection boards."

PROVIDES += "wireless-pv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://TIInit_11.8.32.bts \
	   file://wl18xx-conf.bin \
	   file://wl18xx-fw-4.bin \
	   "
S = "${WORKDIR}"

do_install () {
	install -d ${D}/lib/firmware/ti-connectivity/
	cp ${WORKDIR}/TIInit_11.8.32.bts ${D}/lib/firmware/ti-connectivity/
	cp ${WORKDIR}/wl18xx-conf.bin ${D}/lib/firmware/ti-connectivity/
	cp ${WORKDIR}/wl18xx-fw-4.bin ${D}/lib/firmware/ti-connectivity/
}

FILES_${PN} = " \
	/lib/firmware/ti-connectivity/TIInit_11.8.32.bts \
	/lib/firmware/ti-connectivity/wl18xx-conf.bin \
	/lib/firmware/ti-connectivity/wl18xx-fw-4.bin \
    "

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
