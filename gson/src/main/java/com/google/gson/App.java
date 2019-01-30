package com.google.gson;

/**
 * Date: 28-01-2019
 *
 * Gets flow records and serializes them into JSON representation
 *
 * @author Jehanzeb Ayaz
 */

import java.util.*;
import com.google.gson.Gson;

public class App {

	public String start;
	public String end;
	public double duration;
	public int rtt;
	public int proto;
	public String sip;
	public int sp;
	public String dip;
	public int dp;
	public String iflags;
	public String uflags;
	public String riflags;
	public String ruflags;
	public long isn;
	public long risn;
	public int tag;
	public int rtag;
	public int pkt;
	public int oct;
	public int rpkt;
	public int roct;

	//setter methods
	
	public void setStart(String start)
	{
		this.start = start;
	}

	public void setEnd(String end)
	{
		this.end = end;
	}
	
	public void setDuration(double duration)
	{
		this.duration = duration;
	}
	
	public void setRtt(int rtt)
	{
		this.rtt = rtt;
	}
	
	public void setProto(int proto)
	{
		this.proto = proto;
	}
	
	public void setSip(String sip)
	{
		this.sip = sip;
	}
	
	public void setSp(int sp)
	{
		this.sp = sp;
	}
	
	public void setDip(String dip)
	{
		this.dip = dip;
	}
	
	public void setDp(int dp)
	{
		this.dp = dp;
	}
	
	public void setIflags(String iflags)
	{
		this.iflags = iflags;
	}
	
	public void setUflags(String uflags)
	{
		this.uflags = uflags;
	}
	
	public void setRiflags(String riflags)
	{
		this.riflags = riflags;
	}
	
	public void setRuflags(String ruflags)
	{
		this.ruflags = ruflags;
	}
	
	public void setIsn(long isn)
	{
		this.isn = isn;
	}
	
	public void setRisn(long risn)
	{
		this.risn = risn;
	}
	
	public void setTag(int tag)
	{
		this.tag = tag;
	}
	
	public void setRtag(int rtag)
	{
		this.rtag = rtag;
	}
	
	public void setPkt(int pkt)
	{
		this.pkt = pkt;
	}
	
	public void setOct(int oct)
	{
		this.oct = oct;
	}
	
	public void setRpkt(int rpkt)
	{
		this.rpkt = rpkt;
	}
	
	public void setRoct(int roct)
	{
		this.roct = roct;
	}	
	
	//getter methods

	public String getStart()
	{
		return start;
	}

	public String getEnd()
	{
		return end;
	}
	
	public double getDuration()
	{
		return duration;
	}
	
	public int getRtt()
	{
		return rtt;
	}
	
	public int getProto()
	{
		return proto;
	}
	
	public String getSip()
	{
		return sip;
	}
	
	public int getSp()
	{
		return sp;
	}
	
	public String getDip()
	{
		return dip;
	}
	
	public int getDp()
	{
		return dp;
	}
	
	public String getIflags()
	{
		return iflags;
	}
	
	public String getUflags()
	{
		return uflags;
	}
	
	public String getRiflags()
	{
		return riflags;
	}
	
	public String getRuflags()
	{
		return ruflags;
	}
	
	public long getIsn()
	{
		return isn;
	}
	
	public long getRisn()
	{
		return risn;
	}
	
	public int getTag()
	{
		return tag;
	}
	
	public int getRtag()
	{
		return rtag;
	}
	
	public int getPkt()
	{
		return pkt;
	}
	
	public int getOct()
	{
		return oct;
	}
	
	public int getRpkt()
	{
		return rpkt;
	}
	
	public int getRoct()
	{
		return roct;
	}	

	public static void main(String[] args)
	{
		Gson gson = new Gson();
		
		App networkFlow = new App();
		networkFlow.setStart("2015-09-22 23:33:42.077");
		networkFlow.setEnd("2015-09-22 23:33:42.077");
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

		String flowJson = gson.toJson(networkFlow);
	} 

}