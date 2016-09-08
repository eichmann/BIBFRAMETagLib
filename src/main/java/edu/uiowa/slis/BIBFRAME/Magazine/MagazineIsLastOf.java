package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsLastOfIterator theMagazineIsLastOfIterator = (MagazineIsLastOfIterator)findAncestorWithClass(this, MagazineIsLastOfIterator.class);
			pageContext.getOut().print(theMagazineIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

