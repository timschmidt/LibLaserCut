/**
 * This file is part of LibLaserCut.
 * Copyright (C) 2011 - 2013 Thomas Oster <thomas.oster@rwth-aachen.de>
 * RWTH Aachen University - 52062 Aachen, Germany
 *
 *     LibLaserCut is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     LibLaserCut is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with LibLaserCut.  If not, see <http://www.gnu.org/licenses/>.
 **/
/**
 * Known Limitations:
 * - If there is Raster and Raster3d Part in one job, the speed from 3d raster
 * is taken for both and eventually other side effects:
 * IT IS NOT RECOMMENDED TO USE 3D-Raster and Raster in the same Job
 */

package com.t_oster.liblasercut.drivers;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Thomas Oster <thomas.oster@rwth-aachen.de>
 */
public class EpilogZing extends EpilogCutter
{
  
  public EpilogZing()
  {
  }
  
  public EpilogZing(String hostname)
  {
    super(hostname);
  }
  
  @Override
  public String getModelName()
  {
    return "Epilog ZING";
  }
  
  private static final double[] RESOLUTIONS = new double[]
  {
    100, 200, 250, 400, 500, 1000
  };
  
  @Override
  public List<Double> getResolutions()
  {
    List<Double> result = new LinkedList();
    for (double r : RESOLUTIONS)
    {
      result.add(r);
    }
    return result;
  }
  
  @Override
  public EpilogZing clone()
  {
    EpilogZing result = new EpilogZing();
    result.setHostname(this.getHostname());
    result.setPort(this.getPort());
    result.setBedHeight(this.getBedHeight());
    result.setBedWidth(this.getBedWidth());
    result.setAutoFocus(this.isAutoFocus());
    return result;
  }

  //We need this methods for XMLEncoder to work properly
  @Override
  public boolean isAutoFocus()
  {
    return super.isAutoFocus();
  }
  
  @Override
  public void setAutoFocus(boolean b)
  {
    super.setAutoFocus(b);
  }
  
  @Override
  public void setBedHeight(double bh)
  {
    super.setBedHeight(bh);
  }
  
  @Override
  public double getBedHeight()
  {
    return super.getBedHeight();
  }
  
  @Override
  public void setBedWidth(double bh)
  {
    super.setBedWidth(bh);
  }
  
  @Override
  public double getBedWidth()
  {
    return super.getBedWidth();
  }
  
  @Override
  public void setHostname(String host)
  {
    super.setHostname(host);
  }
  
  @Override
  public String getHostname()
  {
    return super.getHostname();
  }
  
  @Override
  public int getPort()
  {
    return super.getPort();
  }
  
  @Override
  public void setPort(int p)
  {
    super.setPort(p);
  }
}
