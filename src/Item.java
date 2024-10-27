// Kelas Induk Item
class Item {
    protected String judul;
    protected String penulis;

    public Item(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}