/*
 * This file is part of the RootFW Project: https://github.com/spazedog/rootfw
 *  
 * Copyright (c) 2013 Daniel Bergløv
 *
 * RootFW is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * RootFW is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with RootFW. If not, see <http://www.gnu.org/licenses/>
 */

package com.spazedog.rootfw.containers;

public final class FileInfo {
	private String TYPE;
	private String USER;
	private String GROUP;
	private String PERMS;
	private String STRINGPERMS;
	private String LINK;
	
	public FileInfo(String argType, String argUser, String argGroup, String argPerms, String argStringPerms, String argLink) {
		TYPE = argType;
		USER = argUser;
		GROUP = argGroup;
		PERMS = argPerms;
		STRINGPERMS = argStringPerms;
		LINK = argLink;
	}
	
	public String getType() {
		return TYPE;
	}
	
	public String getUser() {
		return USER;
	}
	
	public String getGroup() {
		return GROUP;
	}
	
	public String getPermissions() {
		return PERMS;
	}
	
	public String getPermissionString() {
		return STRINGPERMS;
	}
	
	public String getLink() {
		return LINK;
	}
}
