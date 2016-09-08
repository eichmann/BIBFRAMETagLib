package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasCoverArt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasCoverArt currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasCoverArt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasCoverArtIterator theInstanceHasCoverArtIterator = (InstanceHasCoverArtIterator)findAncestorWithClass(this, InstanceHasCoverArtIterator.class);
			pageContext.getOut().print(theInstanceHasCoverArtIterator.getHasCoverArt());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasCoverArt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasCoverArt tag ");
		}
		return SKIP_BODY;
	}
}

