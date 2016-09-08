package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasCoverArtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasCoverArtType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasCoverArtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasCoverArtIterator theInstanceHasCoverArtIterator = (InstanceHasCoverArtIterator)findAncestorWithClass(this, InstanceHasCoverArtIterator.class);
			pageContext.getOut().print(theInstanceHasCoverArtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasCoverArt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasCoverArt tag ");
		}
		return SKIP_BODY;
	}
}

