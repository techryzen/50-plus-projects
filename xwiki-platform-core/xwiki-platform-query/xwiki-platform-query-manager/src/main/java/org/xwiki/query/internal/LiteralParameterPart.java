/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package org.xwiki.query.internal;

/**
 * Represents characters for which the {@code %}, {@code _} and {@code [} (see http://bit.ly/2ongxm6 to understand more)
 * characters need to be escaped.
 *
 * @version $Id: 85b8cca46204fea6ba4af11941a25fda0c6e00e2 $
 * @since 8.4.5
 * @since 9.3RC1
 */
public class LiteralParameterPart extends ParameterPart
{
    /**
     * @param part the literals that will be escaped
     */
    public LiteralParameterPart(String part)
    {
        super(part);
    }
}
