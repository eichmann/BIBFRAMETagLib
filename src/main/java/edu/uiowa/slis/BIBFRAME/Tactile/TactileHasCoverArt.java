package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasCoverArt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasCoverArt currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasCoverArt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasCoverArtIterator theTactileHasCoverArtIterator = (TactileHasCoverArtIterator)findAncestorWithClass(this, TactileHasCoverArtIterator.class);
			pageContext.getOut().print(theTactileHasCoverArtIterator.getHasCoverArt());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasCoverArt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasCoverArt tag ");
		}
		return SKIP_BODY;
	}
}

