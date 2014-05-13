package com.ray.iptvdemo1.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ChannelContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<ChannelItem> ITEMS = new ArrayList<ChannelItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, ChannelItem> ITEM_MAP = new HashMap<String, ChannelItem>();

	static {
		// Add 3 sample items.
		addItem(new ChannelItem("1", "CCTV-HD", "http://101.95.78.69/PLTV/88888888/224/3221225519/03.m3u8"));
//		addItem(new ChannelItem("2", "��������HD", "http://101.95.78.69/PLTV/88888888/224/3221225542/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("3", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225561/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("4", "�㽭����", "http://101.95.78.69/PLTV/88888888/224/3221225544/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("5", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225545/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("6", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("7", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("8", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225546/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("9", "��������", "http://101.95.78.69/PLTV/88888888/224/3221225549/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("10", "�Ĵ�����", "http://101.95.78.69/PLTV/88888888/224/3221225550/index.m3u8?servicetype=1"));
		addItem(new ChannelItem("11", "ɽ������", "http://101.95.78.69/PLTV/88888888/224/3221225551/index.m3u8?servicetype=1"));
		
	}

	private static void addItem(ChannelItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class ChannelItem {
		public String id;
		public String name;
		public String url;

		public ChannelItem(String id, String name, String url) {
			this.id=id;
			this.name = name;
			this.url = url;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
