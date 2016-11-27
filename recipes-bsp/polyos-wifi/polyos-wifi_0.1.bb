SUMMARY = "PolyOS WiFi connector"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PROVIDES += "polyos-wifi"

SRC_URI = "file://polyos-wifi"
S = "${WORKDIR}"

do_install () {

	install -d ${D}${sbindir}
	install -m 0755 ${WORKDIR}/polyos-wifi ${D}${sbindir}/
}

FILES_${PN} += "${sbindir}/polyos-wifi"
RDEPENDS_${PN} = "wireless-pv"


