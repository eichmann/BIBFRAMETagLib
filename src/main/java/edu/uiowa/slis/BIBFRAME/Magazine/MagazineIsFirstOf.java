package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsFirstOfIterator theMagazineIsFirstOfIterator = (MagazineIsFirstOfIterator)findAncestorWithClass(this, MagazineIsFirstOfIterator.class);
			pageContext.getOut().print(theMagazineIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

