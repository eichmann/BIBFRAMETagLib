package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsLastOfIterator theMagazineIsLastOfIterator = (MagazineIsLastOfIterator)findAncestorWithClass(this, MagazineIsLastOfIterator.class);
			pageContext.getOut().print(theMagazineIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

