package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIdentifiedByIterator theIntegratingResourceIdentifiedByIterator = (IntegratingResourceIdentifiedByIterator)findAncestorWithClass(this, IntegratingResourceIdentifiedByIterator.class);
			pageContext.getOut().print(theIntegratingResourceIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

