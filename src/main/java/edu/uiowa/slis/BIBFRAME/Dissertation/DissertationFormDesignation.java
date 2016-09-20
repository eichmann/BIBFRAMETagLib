package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationFormDesignationIterator theDissertation = (DissertationFormDesignationIterator)findAncestorWithClass(this, DissertationFormDesignationIterator.class);
			pageContext.getOut().print(theDissertation.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

