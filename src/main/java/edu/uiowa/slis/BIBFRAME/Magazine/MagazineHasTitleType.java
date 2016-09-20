package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasTitleIterator theMagazineHasTitleIterator = (MagazineHasTitleIterator)findAncestorWithClass(this, MagazineHasTitleIterator.class);
			pageContext.getOut().print(theMagazineHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

