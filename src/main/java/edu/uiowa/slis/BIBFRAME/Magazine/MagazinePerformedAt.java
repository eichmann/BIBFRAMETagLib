package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePerformedAtIterator theMagazinePerformedAtIterator = (MagazinePerformedAtIterator)findAncestorWithClass(this, MagazinePerformedAtIterator.class);
			pageContext.getOut().print(theMagazinePerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

