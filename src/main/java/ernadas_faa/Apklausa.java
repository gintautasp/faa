package ernadas_faa;

import javax.persistence.*;

@Entity
public class Apklausa {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;
    
    private String lytis;
	private Integer amzius_periodo_pabaigoje;
	
	private String kritines_ligos_pries;
	private String chroniski_negalavimai_pries;	
	private Double nubegamas_atstumas_per_12min_pries;
	private Integer prisitraukimai_pries;			
	
	private Integer periodas_men;
	private String pagr_veikla;
	
	private String neintensyvios_veiklos_rusys;
	private Double val_per_sav_neintensyviai;
	private Integer kartai_per_sav_neintensyviai;
	
	private String intensyvios_veiklos_rusys;
	private Double val_per_sav_intensyviai;
	private Integer kartai_per_sav_intensyviai;
	
	private String pastabos;
	
	private String kritines_ligos_po;
	private String chroniski_negalavimai_po;	
	private Double nubegamas_atstumas_per_12min_po;
	private Integer prisitraukimai_po;
	
	public Apklausa() {
		
	}
	
	public Apklausa(String lytis, Integer amzius_periodo_pabaigoje, String kritines_ligos_pries,
			String chroniski_negalavimai_pries, Double nubegamas_atstumas_per_12min_pries, Integer prisitraukimai_pries,
			Integer periodas_men, String pagr_veikla, String neintensyvios_veiklos_rusys,
			Double val_per_sav_neintensyviai, Integer kartai_per_sav_neintensyviai, String intensyvios_veiklos_rusys,
			Double val_per_sav_intensyviai, Integer kartai_per_sav_intensyviai, String pastabos,
			String kritines_ligos_po, String chroniski_negalavimai_po, Double nubegamas_atstumas_per_12min_po,
			Integer prisitraukimai_po) {
		super();
		this.lytis = lytis;
		this.amzius_periodo_pabaigoje = amzius_periodo_pabaigoje;
		this.kritines_ligos_pries = kritines_ligos_pries;
		this.chroniski_negalavimai_pries = chroniski_negalavimai_pries;
		this.nubegamas_atstumas_per_12min_pries = nubegamas_atstumas_per_12min_pries;
		this.prisitraukimai_pries = prisitraukimai_pries;
		this.periodas_men = periodas_men;
		this.pagr_veikla = pagr_veikla;
		this.neintensyvios_veiklos_rusys = neintensyvios_veiklos_rusys;
		this.val_per_sav_neintensyviai = val_per_sav_neintensyviai;
		this.kartai_per_sav_neintensyviai = kartai_per_sav_neintensyviai;
		this.intensyvios_veiklos_rusys = intensyvios_veiklos_rusys;
		this.val_per_sav_intensyviai = val_per_sav_intensyviai;
		this.kartai_per_sav_intensyviai = kartai_per_sav_intensyviai;
		this.pastabos = pastabos;
		this.kritines_ligos_po = kritines_ligos_po;
		this.chroniski_negalavimai_po = chroniski_negalavimai_po;
		this.nubegamas_atstumas_per_12min_po = nubegamas_atstumas_per_12min_po;
		this.prisitraukimai_po = prisitraukimai_po;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getLytis() {
		return lytis;
	}

	public void setLytis(String lytis) {
		this.lytis = lytis;
	}

	public Integer getAmzius_periodo_pabaigoje() {
		return amzius_periodo_pabaigoje;
	}

	public void setAmzius_periodo_pabaigoje(Integer amzius_periodo_pabaigoje) {
		this.amzius_periodo_pabaigoje = amzius_periodo_pabaigoje;
	}

	public String getKritines_ligos_pries() {
		return kritines_ligos_pries;
	}

	public void setKritines_ligos_pries(String kritines_ligos_pries) {
		this.kritines_ligos_pries = kritines_ligos_pries;
	}

	public String getChroniski_negalavimai_pries() {
		return chroniski_negalavimai_pries;
	}

	public void setChroniski_negalavimai_pries(String chroniski_negalavimai_pries) {
		this.chroniski_negalavimai_pries = chroniski_negalavimai_pries;
	}

	public Double getNubegamas_atstumas_per_12min_pries() {
		return nubegamas_atstumas_per_12min_pries;
	}

	public void setNubegamas_atstumas_per_12min_pries(Double nubegamas_atstumas_per_12min_pries) {
		this.nubegamas_atstumas_per_12min_pries = nubegamas_atstumas_per_12min_pries;
	}

	public Integer getPrisitraukimai_pries() {
		return prisitraukimai_pries;
	}

	public void setPrisitraukimai_pries(Integer prisitraukimai_pries) {
		this.prisitraukimai_pries = prisitraukimai_pries;
	}

	public Integer getPeriodas_men() {
		return periodas_men;
	}

	public void setPeriodas_men(Integer periodas_men) {
		this.periodas_men = periodas_men;
	}

	public String getPagr_veikla() {
		return pagr_veikla;
	}

	public void setPagr_veikla(String pagr_veikla) {
		this.pagr_veikla = pagr_veikla;
	}

	public String getNeintensyvios_veiklos_rusys() {
		return neintensyvios_veiklos_rusys;
	}

	public void setNeintensyvios_veiklos_rusys(String neintensyvios_veiklos_rusys) {
		this.neintensyvios_veiklos_rusys = neintensyvios_veiklos_rusys;
	}

	public Double getVal_per_sav_neintensyviai() {
		return val_per_sav_neintensyviai;
	}

	public void setVal_per_sav_neintensyviai(Double val_per_sav_neintensyviai) {
		this.val_per_sav_neintensyviai = val_per_sav_neintensyviai;
	}

	public Integer getKartai_per_sav_neintensyviai() {
		return kartai_per_sav_neintensyviai;
	}

	public void setKartai_per_sav_neintensyviai(Integer kartai_per_sav_neintensyviai) {
		this.kartai_per_sav_neintensyviai = kartai_per_sav_neintensyviai;
	}

	public String getIntensyvios_veiklos_rusys() {
		return intensyvios_veiklos_rusys;
	}

	public void setIntensyvios_veiklos_rusys(String intensyvios_veiklos_rusys) {
		this.intensyvios_veiklos_rusys = intensyvios_veiklos_rusys;
	}

	public Double getVal_per_sav_intensyviai() {
		return val_per_sav_intensyviai;
	}

	public void setVal_per_sav_intensyviai(Double val_per_sav_intensyviai) {
		this.val_per_sav_intensyviai = val_per_sav_intensyviai;
	}

	public Integer getKartai_per_sav_intensyviai() {
		return kartai_per_sav_intensyviai;
	}

	public void setKartai_per_sav_intensyviai(Integer kartai_per_sav_intensyviai) {
		this.kartai_per_sav_intensyviai = kartai_per_sav_intensyviai;
	}

	public String getPastabos() {
		return pastabos;
	}

	public void setPastabos(String pastabos) {
		this.pastabos = pastabos;
	}

	public String getKritines_ligos_po() {
		return kritines_ligos_po;
	}

	public void setKritines_ligos_po(String kritines_ligos_po) {
		this.kritines_ligos_po = kritines_ligos_po;
	}

	public String getChroniski_negalavimai_po() {
		return chroniski_negalavimai_po;
	}

	public void setChroniski_negalavimai_po(String chroniski_negalavimai_po) {
		this.chroniski_negalavimai_po = chroniski_negalavimai_po;
	}

	public Double getNubegamas_atstumas_per_12min_po() {
		return nubegamas_atstumas_per_12min_po;
	}

	public void setNubegamas_atstumas_per_12min_po(Double nubegamas_atstumas_per_12min_po) {
		this.nubegamas_atstumas_per_12min_po = nubegamas_atstumas_per_12min_po;
	}

	public Integer getPrisitraukimai_po() {
		return prisitraukimai_po;
	}

	public void setPrisitraukimai_po(Integer prisitraukimai_po) {
		this.prisitraukimai_po = prisitraukimai_po;
	}    

	
}
