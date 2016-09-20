package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSeparatedFromIterator theMagazineSeparatedFromIterator = (MagazineSeparatedFromIterator)findAncestorWithClass(this, MagazineSeparatedFromIterator.class);
			pageContext.getOut().print(theMagazineSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

