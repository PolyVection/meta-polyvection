
DESCRIPTION = "Sigma-Loader for Sigma-DSP firmware uploads"
DEPENDS = "libconfig libxml2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCBRANCH = "master"
SRCREV = "e76fc8dd3865839a1605e043fbae1aa645e9a2b4"
SRC_URI = 	"git://github.com/polyvection/sigma-loader.git;branch=${SRCBRANCH} "
SRC_URI += "file://dsp.xml"

S = "${WORKDIR}/git"

do_compile_prepend () {
	cp ${WORKDIR}/git/* ${WORKDIR}/build/
}

do_install_append () {
	install -d ${D}${sysconfdir}/sigma-dsp
	install -m 0755 ${WORKDIR}/dsp.xml ${D}${sysconfdir}/sigma-dsp/
}
FILES_${PN} += "${sysconfdir}/sigma-dsp/dsp.xml"

inherit autotools pkgconfig
