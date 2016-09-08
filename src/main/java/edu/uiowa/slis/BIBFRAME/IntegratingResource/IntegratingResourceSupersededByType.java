package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSupersededByIterator theIntegratingResourceSupersededByIterator = (IntegratingResourceSupersededByIterator)findAncestorWithClass(this, IntegratingResourceSupersededByIterator.class);
			pageContext.getOut().print(theIntegratingResourceSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

