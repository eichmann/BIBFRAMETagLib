package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationDissertationYear extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationDissertationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationDissertationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationDissertationYearIterator theDissertation = (DissertationDissertationYearIterator)findAncestorWithClass(this, DissertationDissertationYearIterator.class);
			pageContext.getOut().print(theDissertation.getDissertationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for dissertationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for dissertationYear tag ");
		}
		return SKIP_BODY;
	}
}

