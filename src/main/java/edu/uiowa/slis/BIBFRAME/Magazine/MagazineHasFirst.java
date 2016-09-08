package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasFirst extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasFirst currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasFirst.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasFirstIterator theMagazineHasFirstIterator = (MagazineHasFirstIterator)findAncestorWithClass(this, MagazineHasFirstIterator.class);
			pageContext.getOut().print(theMagazineHasFirstIterator.getHasFirst());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

