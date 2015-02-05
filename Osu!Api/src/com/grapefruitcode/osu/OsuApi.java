package com.grapefruitcode.osu;

import com.google.gson.Gson;
/**
 * 
 * @author Alex Markovich
 * @since
 */
public class OsuApi {

	private String apiKey;
	private String url =  "osu.ppy.sh";
	private String gbUrl = "/api/get_beatmaps/";
	Gson gson = new Gson();
	 JsonDownloader js = new JsonDownloader();
	 Get_Beatmaps gb = new Get_Beatmaps();
	 public OsuApi(String ApiKey){
		apiKey = ApiKey;
	}
	 /**
	  * 
	  * @param s Beatmapset id, enter "" or a blank string if you don't want to use this param.
	  * @param b Beatmap id, enter "" or a blank string if you don't want to use this param.
	  * @param u User id, enter "" or a blank string if you don't want to use this param.
	  * @return Returns the approved JSON data as a string, 3 = qualified, 2 = approved, 1 = ranked, 0 = pending, -1 = WIP, -2 = graveyard
	 * @throws Exception Idk java is stupid
	 * @see Get_Beatmaps
	  */
	 public String getApproved_Beatmaps(String s, String b, String u) throws Exception{
		String h = js.readUrl(url+gbUrl +"?k="+apiKey+"&s="+s+"&b="+b+"&u="+u);
		gson.fromJson(h, Get_Beatmaps.class);
			

			return u;
	
		 
	 }
	
}



