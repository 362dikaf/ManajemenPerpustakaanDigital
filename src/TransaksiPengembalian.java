class TransaksiPengembalian {
    private Buku buku;
    private Anggota anggota;

    public TransaksiPengembalian(Buku buku, Anggota anggota) {
        this.buku = buku;
        this.anggota = anggota;
    }

    public void eksekusi() {
        System.out.println("Pengembalian buku berhasil.");
    }
}