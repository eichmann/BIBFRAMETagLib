package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineFrequencyIterator theMagazine = (MagazineFrequencyIterator)findAncestorWithClass(this, MagazineFrequencyIterator.class);
			pageContext.getOut().print(theMagazine.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for frequency tag ");
		}
		return SKIP_BODY;
	}
}

