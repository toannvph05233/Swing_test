
package lopA;


public class HocSinh{
    private String hoten,ngoaiNgu;
    private int tuoi;

    public HocSinh() {
    }

    public HocSinh(String hoten, String ngoaiNgu, int tuoi) {
        this.hoten = hoten;
        this.ngoaiNgu = ngoaiNgu;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "hoten=" + hoten + ", ngoaiNgu=" + ngoaiNgu + ", tuoi=" + tuoi + '}';
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}
