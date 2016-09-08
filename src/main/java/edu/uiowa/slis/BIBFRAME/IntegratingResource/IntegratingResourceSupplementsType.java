package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSupplementsIterator theIntegratingResourceSupplementsIterator = (IntegratingResourceSupplementsIterator)findAncestorWithClass(this, IntegratingResourceSupplementsIterator.class);
			pageContext.getOut().print(theIntegratingResourceSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for supplements tag ");
		}
		return SKIP_BODY;
	}
}

