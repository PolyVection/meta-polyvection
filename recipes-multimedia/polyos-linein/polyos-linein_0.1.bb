SUMMARY = "PolyOS Line-In"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PROVIDES += "polyos-linein"

SRC_URI = 	"file://polyos-linein \
		"
S = "${WORKDIR}"

do_install () {

	install -d ${D}${sbindir}
	install -m 0755 ${WORKDIR}/polyos-linein ${D}${sbindir}/
}

FILES_${PN} += "${sbindir}/polyos-linein"



