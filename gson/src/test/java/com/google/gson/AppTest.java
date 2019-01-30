package com.google.gson;

import com.google.gson.Gson;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void Test() {
		
		String expectedOutput = "{" 
		+ "\"start\":\"2015-09-22 23:33:42.077\","
		+ "\"end\":\"2015-09-22 23:33:42.631\","
		+ "\"duration\":0.554,"
		+ "\"rtt\":0,"
		+ "\"proto\":6,"
		+ "\"sip\":\"2001:0708:0040:3001:6670:02ff:fefc:137f\","
		+ "\"sp\":39367,"
		+ "\"dip\":\"2001:0638:0709:3000::0019\","
		+ "\"dp\":443,"
		+ "\"iflags\":\"S\","
		+ "\"uflags\":\"APF\","
		+ "\"riflags\":\"AS\","
		+ "\"ruflags\":\"APF\","
		+ "\"isn\":767467070,"
		+ "\"risn\":783117522,"
		+ "\"tag\":0,"
		+ "\"rtag\":0,"
		+ "\"pkt\":11,"
		+ "\"oct\":2552,"
		+ "\"rpkt\":9,"
		+ "\"roct\":2576"
		+ "}";



		Gson gson = new Gson();
		
		App networkFlow = new App();
		networkFlow.setStart("2015-09-22 23:33:42.077");
		networkFlow.setEnd("2015-09-22 23:33:42.631");
		networkFlow.setDuration(0.554);
		networkFlow.setRtt(0);
		networkFlow.setProto(6);
		networkFlow.setSip("2001:0708:0040:3001:6670:02ff:fefc:137f");
		networkFlow.setSp(39367);
		networkFlow.setDip("2001:0638:0709:3000::0019");
		networkFlow.setDp(443);
		networkFlow.setIflags("S");
		networkFlow.setUflags("APF");
		networkFlow.setRiflags("AS");
		networkFlow.setRuflags("APF");
		networkFlow.setIsn(767467070);
		networkFlow.setRisn(783117522);
		networkFlow.setTag(0);
		networkFlow.setRtag(0);
		networkFlow.setPkt(11);
		networkFlow.setOct(2552);
		networkFlow.setRpkt(9);
		networkFlow.setRoct(2576);
		
		String actualOutput = gson.toJson(networkFlow);
		
		assertEquals(expectedOutput, actualOutput);
	}
}
