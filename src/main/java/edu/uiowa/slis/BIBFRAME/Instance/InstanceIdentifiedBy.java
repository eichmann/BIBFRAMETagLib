package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIdentifiedByIterator theInstanceIdentifiedByIterator = (InstanceIdentifiedByIterator)findAncestorWithClass(this, InstanceIdentifiedByIterator.class);
			pageContext.getOut().print(theInstanceIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

