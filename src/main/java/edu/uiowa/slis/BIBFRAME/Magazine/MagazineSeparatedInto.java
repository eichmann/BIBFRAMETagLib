package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSeparatedIntoIterator theMagazineSeparatedIntoIterator = (MagazineSeparatedIntoIterator)findAncestorWithClass(this, MagazineSeparatedIntoIterator.class);
			pageContext.getOut().print(theMagazineSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

