package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRecordedAtIterator theMagazineRecordedAtIterator = (MagazineRecordedAtIterator)findAncestorWithClass(this, MagazineRecordedAtIterator.class);
			pageContext.getOut().print(theMagazineRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}
