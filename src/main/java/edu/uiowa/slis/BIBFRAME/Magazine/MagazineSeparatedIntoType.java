package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSeparatedIntoIterator theMagazineSeparatedIntoIterator = (MagazineSeparatedIntoIterator)findAncestorWithClass(this, MagazineSeparatedIntoIterator.class);
			pageContext.getOut().print(theMagazineSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

