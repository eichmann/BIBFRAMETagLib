package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceFormDesignationIterator theIntegratingResource = (IntegratingResourceFormDesignationIterator)findAncestorWithClass(this, IntegratingResourceFormDesignationIterator.class);
			pageContext.getOut().print(theIntegratingResource.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

