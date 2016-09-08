package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasPartIterator theIntegratingResourceHasPartIterator = (IntegratingResourceHasPartIterator)findAncestorWithClass(this, IntegratingResourceHasPartIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

