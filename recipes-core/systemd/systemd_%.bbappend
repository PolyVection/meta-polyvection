FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PACKAGECONFIG += "networkd resolved"

do_install_append() {

	ln -sf /run/systemd/resolve/resolv.conf ${D}${sysconfdir}/resolv.conf

}
