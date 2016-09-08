package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasPartIterator theDissertationHasPartIterator = (DissertationHasPartIterator)findAncestorWithClass(this, DissertationHasPartIterator.class);
			pageContext.getOut().print(theDissertationHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

