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
package org.chromattic.api.query;

import org.chromattic.api.ChromatticException;

/**
 * A base interface for all queries.
 *
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public interface Query<O> {

  /**
   * Executes the query and return the result as a serie of Chromattic entities.
   *
   * @return the query result
   * @throws ChromatticException any chromattic exception
   */
  QueryResult<O> objects() throws ChromatticException;

  /**
   * Executes the query and return the result as a serie of Chromattic entities with the specified
   * limit and offset.
   *
   * @param offset the optional offset
   * @param limit the optional limit
   * @return the query result
   * @throws ChromatticException any chromattic exception
   * @throws IllegalArgumentException if the offset or limit argument is negative
   */
  QueryResult<O> objects(Long offset, Long limit) throws ChromatticException;
}
