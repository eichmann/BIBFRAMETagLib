package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSeparatedFromIterator theMagazineSeparatedFromIterator = (MagazineSeparatedFromIterator)findAncestorWithClass(this, MagazineSeparatedFromIterator.class);
			pageContext.getOut().print(theMagazineSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

