
DESCRIPTION = "Shairport-Sync - AirPlay audio player"
DEPENDS = "alsa-lib initscripts libdaemon libconfig libupnp gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-bad gstreamer1.0-plugins-ugly gstreamer1.0-libav"
LICENSE = "GNUv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "57dfbfd474f9008cc91f7a57b38ec4a7f96ae593"
SRC_URI = 	"git://github.com/hzeller/gmrender-resurrect.git \
		file://gmediarenderer"

S = "${WORKDIR}/git"

INITSCRIPT_NAME = "gmediarenderer"
INITSCRIPT_PARAMS = "defaults 90 10"


do_configure_prepend() {	
	#cp ${WORKDIR}/shairport-sync.in ${WORKDIR}/git/scripts/shairport-sync.in
}

do_compile_prepend() {
	#cp ${WORKDIR}/shairport-sync.conf ${WORKDIR}/build/scripts/shairport-sync.conf		
}

do_compile_append() {
	#cp ${WORKDIR}/git/scripts/init.d/gmediarenderer ${sysconfdir}/init.d/gmediarenderer		
}

do_install_append () {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/gmediarenderer  ${D}${sysconfdir}/init.d/
}

FILES_${PN} += "/usr/share/gmediarender/grender-64x64.png \
	       /usr/share/gmediarender/grender-128x128.png"

RDEPENDS_${PN} = "alsa-lib initscripts libdaemon libconfig libupnp gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-bad gstreamer1.0-plugins-ugly gstreamer1.0-libav"

inherit autotools pkgconfig update-rc.d

CONFFILES_${PN} += "${sysconfdir}/init.d/gmediarenderer"
