/* Copyright (C) 2000, 2002  Free Software Foundation

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

As a special exception, if you link this library with other files to
produce an executable, this library does not by itself cause the
resulting executable to be covered by the GNU General Public License.
This exception does not however invalidate any other reasons why the
executable file might be covered by the GNU General Public License. */

package java.awt.color;

// Currently just a stub.

/**
 * @author Rolf W. Rasmussen <rolfwr@ii.uib.no>
 */
public class ICC_Profile
{
  long profileID; // why long?
  
  ICC_Profile(long profileID)
  {
    this.profileID = profileID;
  }

  public int getNumComponents()
  {
    switch ((int) profileID)
      {
      case ColorSpace.CS_sRGB:
      case ColorSpace.CS_LINEAR_RGB:
      case ColorSpace.CS_CIEXYZ:
	return 3;
      case ColorSpace.CS_GRAY:
	return 1;
      case ColorSpace.CS_PYCC:    // have no clue about this one
      default:
	throw new UnsupportedOperationException("profile not implemented");
      }
  }
}
