package org.batfish.representation.palo_alto;

import java.io.Serializable;
import org.batfish.common.Warnings;
import org.batfish.datamodel.IpAccessList;
import org.batfish.datamodel.LineAction;

public interface ServiceGroupMember extends Serializable {
  /** Convert the ServiceGroupMember to an IpAccessList */
  IpAccessList toIpAccessList(LineAction action, PaloAltoConfiguration pc, Vsys vsys, Warnings w);

  /** Return the name of this ServiceGroupMember */
  String getName();
}
