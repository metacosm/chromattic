/*
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.chromattic.test.onetomany.hierarchical.list;

import org.chromattic.core.api.ChromatticSessionImpl;
import org.chromattic.test.AbstractTestCase;

import java.util.List;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 */
public class RenameTestCase extends AbstractTestCase {

  protected void createDomain() {
    addClass(A1.class);
    addClass(B1.class);
  }
  public void testRename() throws Exception {

    ChromatticSessionImpl session = login();
    A1 a = session.insert(A1.class, "a");
    List<B1> bs = a.getChildren();
    bs.add(session.create(B1.class, "1"));
    bs.add(session.create(B1.class, "2"));
    session.save();
    session.close();

    System.out.println("CACA " + session.getPath(a));

    //
    session = login();
    a = session.findByPath(A1.class, "a");
    bs = a.getChildren();
    B1 b1 = bs.get(0);
    assertEquals("1", b1.getName());
    B1 b2 = bs.get(1);
    assertEquals("2", b2.getName());
    b1.setName("3");
    session.save();
    session.close();

    //
    session = login();
    a = session.findByPath(A1.class, "a");
    bs = a.getChildren();
    b1 = bs.get(0);
    assertEquals("3", b1.getName());
    b2 = bs.get(1);
    assertEquals("2", b2.getName());
    session.close();
    System.out.println("PROUT");
  }
}
