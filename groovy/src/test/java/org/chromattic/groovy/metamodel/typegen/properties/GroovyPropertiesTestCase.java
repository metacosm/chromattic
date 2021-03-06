/*
* Copyright (C) 2003-2009 eXo Platform SAS.
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

package org.chromattic.groovy.metamodel.typegen.properties;

import org.chromattic.metamodel.typegen.properties.A1;
import org.chromattic.metamodel.typegen.properties.B1;
import org.chromattic.metamodel.typegen.properties.C1;
import org.chromattic.metamodel.typegen.properties.SchemaTestCase;
import org.chromattic.testgenerator.UniversalTest;

/**
 * @author <a href="mailto:alain.defrance@exoplatform.com">Alain Defrance</a>
 * @version $Revision$
 */
@UniversalTest(
  sourceClass = SchemaTestCase.class,
  baseDir = "metamodel",
  suffix = "MetamodelTest",
  chromatticClasses = {A1.class, B1.class, C1.class})
public class GroovyPropertiesTestCase {}
