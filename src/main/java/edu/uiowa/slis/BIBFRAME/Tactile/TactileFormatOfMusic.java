package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileFormatOfMusic extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileFormatOfMusic currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileFormatOfMusic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileFormatOfMusicIterator theTactile = (TactileFormatOfMusicIterator)findAncestorWithClass(this, TactileFormatOfMusicIterator.class);
			pageContext.getOut().print(theTactile.getFormatOfMusic());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for formatOfMusic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for formatOfMusic tag ");
		}
		return SKIP_BODY;
	}
}

