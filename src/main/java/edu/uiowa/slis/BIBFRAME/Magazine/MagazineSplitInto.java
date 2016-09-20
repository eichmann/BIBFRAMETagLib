package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSplitIntoIterator theMagazineSplitIntoIterator = (MagazineSplitIntoIterator)findAncestorWithClass(this, MagazineSplitIntoIterator.class);
			pageContext.getOut().print(theMagazineSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

