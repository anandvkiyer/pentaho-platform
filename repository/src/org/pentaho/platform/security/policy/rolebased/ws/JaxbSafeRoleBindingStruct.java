/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License, version 2 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package org.pentaho.platform.security.policy.rolebased.ws;

import java.util.List;

import org.pentaho.platform.security.policy.rolebased.RoleBindingStruct;

/**
 * JAXB-safe version of {@code RoleBindingStruct}. ({@code RoleBindingStruct} has contains a {@code Map}.)
 * 
 * @see RoleBindingStruct
 * 
 * @author mlowery
 */
public class JaxbSafeRoleBindingStruct {
  public List<StringKeyStringValueMapEntry> logicalRoleNameMapEntries;

  public List<StringKeyListValueMapEntry> bindingMapEntries;
}
