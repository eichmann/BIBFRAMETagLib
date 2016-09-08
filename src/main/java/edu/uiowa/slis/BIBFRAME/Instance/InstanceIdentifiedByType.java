package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIdentifiedByIterator theInstanceIdentifiedByIterator = (InstanceIdentifiedByIterator)findAncestorWithClass(this, InstanceIdentifiedByIterator.class);
			pageContext.getOut().print(theInstanceIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

