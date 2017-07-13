
DESCRIPTION = "Shairport-Sync - AirPlay audio player"
DEPENDS = "libdaemon libconfig popt avahi alsa-utils alsa-lib"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES;md5=07500f0fdc8de2e270a9f0b8b1857ecd"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "3f551119b6ebea3c34d18d00901867a396da57a3"
SRC_URI = 	"git://github.com/mikebrady/shairport-sync.git \
		file://shairport-sync.conf \
		file://shairport-sync.in"

S = "${WORKDIR}/git"

INITSCRIPT_NAME = "shairport-sync"
INITSCRIPT_PARAMS = "defaults 90 10"


do_configure_prepend() {	
	cp ${WORKDIR}/shairport-sync.in ${WORKDIR}/git/scripts/shairport-sync.in
}

do_compile_prepend() {
	cp ${WORKDIR}/shairport-sync.conf ${WORKDIR}/build/scripts/shairport-sync.conf		
}

EXTRA_OECONF_append = " --sysconfdir=/etc --with-alsa --with-avahi --with-ssl=openssl --with-metadata --with-systemv"
RDEPENDS_${PN} = "openssl popt initscripts avahi-daemon"

inherit autotools pkgconfig update-rc.d

CONFFILES_${PN} += "${sysconfdir}/init.d/shairport-sync"
