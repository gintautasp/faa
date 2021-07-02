package ernadas_faa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	@Autowired
	private ApklausaRepository apklausa_repository;		

	@RequestMapping(path="/apklausa", method={ RequestMethod.GET, RequestMethod.POST })
	public String apklausa(
			@RequestParam(name="lytis", required=false, defaultValue="V") String lytis
			, @RequestParam(name="amzius_periodo_pabaigoje", required=false, defaultValue="40") String amzius_periodo_pabaigoje
			
			, @RequestParam(name="kritines_ligos_pries", required=false, defaultValue="") String kritines_ligos_pries
			, @RequestParam(name="chroniski_negalavimai_pries", required=false, defaultValue="") String chroniski_negalavimai_pries	
			, @RequestParam(name="nubegamas_atstumas_per_12min_pries", required=false, defaultValue="2") String nubegamas_atstumas_per_12min_pries
			, @RequestParam(name="prisitraukimai_pries", required=false, defaultValue="4") String prisitraukimai_pries			
			
			, @RequestParam(name="periodas_men", required=false, defaultValue="periodas") String periodas_men
			, @RequestParam(name="pagr_veikla", required=false, defaultValue="namu_seimininke") String pagr_veikla
			
			, @RequestParam(name="neintensyvios_veiklos_rusys", required=false, defaultValue="ėjimas,namų ruoša") String neintensyvios_veiklos_rusys
			, @RequestParam(name="val_per_sav_neintensyviai", required=false, defaultValue="6") String val_per_sav_neintensyviai
			, @RequestParam(name="kartai_per_sav_neintensyviai", required=false, defaultValue="10.0") String kartai_per_sav_neintensyviai
			
			, @RequestParam(name="intensyvios_veiklos_rusys", required=false, defaultValue="") String intensyvios_veiklos_rusys
			, @RequestParam(name="val_per_sav_intensyviai", required=false, defaultValue="5.0") String val_per_sav_intensyviai
			, @RequestParam(name="kartai_per_sav_intensyviai", required=false, defaultValue="5") String kartai_per_sav_intensyviai
			
			, @RequestParam(name="pastabos", required=false, defaultValue="") String pastabos
			
			, @RequestParam(name="kritines_ligos_po", required=false, defaultValue="") String kritines_ligos_po
			, @RequestParam(name="chroniski_negalavimai_po", required=false, defaultValue="") String chroniski_negalavimai_po	
			, @RequestParam(name="nubegamas_atstumas_per_12min_po", required=false, defaultValue="2.5") String nubegamas_atstumas_per_12min_po
			, @RequestParam(name="prisitraukimai_po", required=false, defaultValue="7") String prisitraukimai_po
			
			, @RequestParam(name="saugoti", required=false, defaultValue="nesaugoti") String saugoti
			
			) {
		
		if ( ( saugoti != null ) && saugoti.equals ("saugoti") ) {
			
			Apklausa apklausa = new Apklausa ( 
					lytis
					, Integer.parseInt ( amzius_periodo_pabaigoje )
					
					, kritines_ligos_pries
					, chroniski_negalavimai_pries	
					, Double.parseDouble ( nubegamas_atstumas_per_12min_pries )
					, Integer.parseInt ( prisitraukimai_pries )		
					
					, Integer.parseInt ( periodas_men )
					, pagr_veikla
					
					, neintensyvios_veiklos_rusys
					, Double.parseDouble (val_per_sav_neintensyviai )
					, Integer.parseInt ( kartai_per_sav_neintensyviai )
					
					, intensyvios_veiklos_rusys
					, Double.parseDouble ( val_per_sav_intensyviai )
					, Integer.parseInt ( kartai_per_sav_intensyviai )
					
					, pastabos
					
					, kritines_ligos_po
					, chroniski_negalavimai_po	
					, Double.parseDouble ( nubegamas_atstumas_per_12min_po )
					, Integer.parseInt (  prisitraukimai_po)
				);
			apklausa_repository.save(apklausa);
		}
		
		return "apklausa";
	}
}
