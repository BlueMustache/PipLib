package com.yates.pipboylib;

class MessageType {
	public static final int KEEP_ALIVE = 0;
	public static final int CONNECTION = 1;
	public static final int CONNECTION_REFUSED = 2;
	public static final int DATA_UPDATE = 3;
	public static final int LOCAL_MAP_UPDATE = 4;
	public static final int COMMAND = 5;
	public static final int COMMAND_RESULT = 6;
//	KEEP_ALIVE(0), CONNECTION_ACCEPTED(1), CONNECTION_REFUSED(2), DATA_UPDATE(3), LOCAL_MAP_UPDATE(4), COMMAND(5), COMMAND_RESULT(6);
	
	enum DownloadType { KEEP_ALIVE, CONNECTION, CONNECTION_REFUSED, DATA_UPDATE, LOCAL_MAP_UPDATE, COMMAND, COMMAND_RESULT}
}
